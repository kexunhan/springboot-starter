package cn.kolmap.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author kxhan
 * @createTime 2020/12/02
 */
@ConfigurationProperties(prefix = "cn.kolmap")
public class HelloProterties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }


}
