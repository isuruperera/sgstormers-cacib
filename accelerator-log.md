# Accelerator Log

## Options
```json
{
  "bsGitBranch" : "main",
  "bsGitRepository" : "github.com?owner=isuruperera&repo=sgstormers-coding-competition",
  "projectName" : "sta-spring-boot-trading-agent-stormers",
  "staBiddingUser" : "stormers",
  "staMarketplaceUrl" : "https://sta.az.run.withtanzu.com"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ engine.transformations[0].validated.delegate (Let)
┃ ┃ ┃ Debug Adding symbol workloadResourceName with value 'sta-spring-boot-trading-agent-stormers'
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in (Chain)
┃ ┃ ┃ ┃  Info Running Chain(Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-config.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-oauth2.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgentRequest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BuyLowerStockBidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/RandomBidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/Stock.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/security/SecurityConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/web/RestTemplateConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-dev.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-oauth2.yaml.template matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/vmware/tanzu/demos/sta/tradingagent/ApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/application-test.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[0].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [pom.xml, config/workload.yaml, config-sandbox/workload.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-config.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-oauth2.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/Application.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgent.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgentRequest.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidController.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BuyLowerStockBidAgent.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/RandomBidAgent.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/Stock.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/security/SecurityConfig.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/web/RestTemplateConfig.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-dev.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-oauth2.yaml.template didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/vmware/tanzu/demos/sta/tradingagent/ApplicationTests.java didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/resources/application-test.yaml didn't match [pom.xml, config/workload.yaml, config-sandbox/workload.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-config.yaml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-oauth2.yaml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/Application.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgent.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgentRequest.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidController.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BuyLowerStockBidAgent.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/RandomBidAgent.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/Stock.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/security/SecurityConfig.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/web/RestTemplateConfig.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-dev.yaml didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-oauth2.yaml.template didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/vmware/tanzu/demos/sta/tradingagent/ApplicationTests.java didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/resources/application-test.yaml didn't match [pom.xml, Tiltfile, src/main/resources/application.yaml, catalog/catalog-info.yaml, config/workload.yaml, config/app-operator/sta-trading-agent-config.yaml, config/app-operator/sta-trading-agent-oauth2.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗  Info Will replace [sta-trading-agent->sta-spring-boot-trad...(truncated), insert-user->stormers, https://sta.az.run.withtanzu.com->https://sta.az.run.w...(truncated)]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[0].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/app-operator/sta-trading-agent-oauth2.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/application.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'catalog/catalog-info.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/app-operator/sta-trading-agent-config.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┗ ┗ Debug Multiple representations for path 'Tiltfile', will use the one appearing last 
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(InvokeFragment, Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].validated (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Condition (#bsGitRepository != null) evaluated to true
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Let
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].validated.delegate (Let)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol repoUrl with value 'https://github.com?owner=isuruperera&repo=sgstormers-coding-competition'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].validated.delegate.in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(OpenRewriteRecipe, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].validated.delegate.in.transformations[0] (OpenRewriteRecipe)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[0].validated.delegate.in.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ ┗  Info Will replace regex '(?<beforeBranch>[\s\S]+)(?<branch>branch: [\S]+)(?<rest>[\S\s]*)' with '${beforeBranch}branc...(truncated)'
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Combo running as Include
┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[0].sources[1].delegate (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/web/RestTemplateConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/resources/application-test.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-oauth2.yaml.template matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application-dev.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidController.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/Stock.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/vmware/tanzu/demos/sta/tradingagent/ApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/RandomBidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgentRequest.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/Application.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/security/SecurityConfig.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BuyLowerStockBidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgent.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-oauth2.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug config/app-operator/sta-trading-agent-config.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Tiltfile matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.in.transformations[1].delegate.transformations[1] (UniquePath)
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/web/RestTemplateConfig.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path '.gitignore', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/app-operator/sta-trading-agent-oauth2.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/test/resources/application-test.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/application-dev.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/application-oauth2.yaml.template', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/resources/application.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidController.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'pom.xml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'catalog/catalog-info.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'README.md', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/Stock.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/workload.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/test/java/com/vmware/tanzu/demos/sta/tradingagent/ApplicationTests.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'Tiltfile', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'config/app-operator/sta-trading-agent-config.yaml', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/RandomBidAgent.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgentRequest.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path '.tanzuignore', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/Application.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BidAgent.java', will use the one appearing last 
┃ ┃ ┃ ┃ ┃ ┃ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/bid/BuyLowerStockBidAgent.java', will use the one appearing last 
┃ ┗ ┗ ┗ ┗ ┗ Debug Multiple representations for path 'src/main/java/com/vmware/tanzu/demos/sta/tradingagent/security/SecurityConfig.java', will use the one appearing last 
┗ ╺ engine.transformations[1] (UniquePath)
```
