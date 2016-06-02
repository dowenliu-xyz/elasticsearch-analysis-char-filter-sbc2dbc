package xyz.dowenwork.elasticsearch.index.analysis;

import org.elasticsearch.index.analysis.AnalysisModule;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class Sbc2dbcAnalysisBinderProcessor extends AnalysisModule.AnalysisBinderProcessor {
    @Override
    public void processCharFilters(CharFiltersBindings charFiltersBindings) {
        charFiltersBindings.processCharFilter("sbc2dbc", SBC2DBCCharFilterFactory.class);
    }
}
