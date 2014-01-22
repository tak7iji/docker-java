package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by mash on 14/01/22.
 */
public class PortBinding {
    @JsonProperty("HostIp") public String hostIp;
    @JsonProperty("HostPort") public String hostPort;

    public String getHostIp() { return hostIp; }
    public void setHostIp(String hostIp) { this.hostIp = hostIp; }

    public String getHostPort() { return hostPort; }
    public void setHostPort(String hostPort) { this.hostPort = hostPort; }

    @Override
    public String toString() {
        return "";
    }
}
