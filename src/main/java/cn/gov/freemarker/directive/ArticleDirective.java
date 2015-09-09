package cn.gov.freemarker.directive;

import cn.gov.freemarker.DataChecker;
import cn.gov.model.Article;
import cn.gov.service.ArticleService;
import freemarker.core.Environment;
import freemarker.template.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 王勇 on 2015/8/25.
 */
public class ArticleDirective implements TemplateDirectiveModel {
    private ArticleService articleService;
    private static final String ID_NAME = "id";
    @Override
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
        int id = -1;
        Iterator paramIterator = params.entrySet().iterator();
        while (paramIterator.hasNext()) {
            Map.Entry ent = (Map.Entry) paramIterator.next();
            String paramName = (String) ent.getKey();
            TemplateModel paramValue = (TemplateModel)
                    ent.getValue();
            if (paramName.equals(ID_NAME)) {
                id = DataChecker.checkInt(paramValue, paramName);
            } else {
                throw new TemplateModelException("不支持参数: " + paramName);
            }
        }
        if (id < 0) {
            throw new TemplateModelException("参数" + ID_NAME + "不能为空");
        }
        Article article = articleService.queryArticleById(id);
        // 执行真正指令的执行部分:
        if (body != null) {
            if (loopVars.length > 0) {
                loopVars[0] = ObjectWrapper.DEFAULT_WRAPPER.wrap(article);
            }
            // 执行嵌入体部分（和 FTL 中的<#nested>一样）。
            // 这种情况下，我们不提供一个特殊的 writer 作为参数:
            body.render(env.getOut());
        }
    }

    public ArticleService getArticleService() {
        return articleService;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
