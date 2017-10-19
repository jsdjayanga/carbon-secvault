module org.wso2.carbon.secvault {
    requires slf4j.api;
    requires snakeyaml;
    requires org.wso2.carbon.utils;

    exports org.wso2.carbon.secvault;
    exports org.wso2.carbon.secvault.exception;
    exports org.wso2.carbon.secvault.model;
    exports org.wso2.carbon.secvault.model.masterkey;

    opens org.wso2.carbon.secvault.model;
    opens org.wso2.carbon.secvault.model.masterkey;
}