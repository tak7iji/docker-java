package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
public class HostConfig {

    @JsonProperty("Binds")
    private String[] binds;

    @JsonProperty("ContainerIDFile")
    private String containerIDFile;

    @JsonProperty("LxcConf")
    private LxcConf[] lxcConf;

    @JsonProperty("Privileged")
    public boolean privileged;

    @JsonProperty("PortBindings")
    public Map<String, PortBinding[]> portBindinds;

    @JsonProperty("Links")
    public String links;

    @JsonProperty("PublishAllPorts")
    public boolean publishAllPorts;

    public HostConfig() {}

    public String[] getBinds() {
        return binds;
    }

    public void setBinds(String[] binds) {
        this.binds = binds;
    }

    public String getContainerIDFile() {
        return containerIDFile;
    }

    public void setContainerIDFile(String containerIDFile) {
        this.containerIDFile = containerIDFile;
    }

    public LxcConf[] getLxcConf() {
        return lxcConf;
    }

    public void setLxcConf(LxcConf[] lxcConf) {
        this.lxcConf = lxcConf;
    }

    public class LxcConf {
        @JsonProperty("Key")
        public String key;

        @JsonProperty("Value")
        public String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public boolean isPrivileged() { return privileged; }

    public void setPrivileged(boolean privileged) { this.privileged = privileged; }

    public Map<String, PortBinding[]> getPortBindinds() { return portBindinds; }

    public void setPortBindinds(Map<String, PortBinding[]> portBindinds) { this.portBindinds = portBindinds; }

    public String getLinks() { return links; }

    public void setLinks(String links) { this.links = links; }

    public boolean isPublishAllPorts() { return publishAllPorts; }

    public void setPublishAllPorts(boolean publishAllPorts) { this.publishAllPorts = publishAllPorts; }

}
