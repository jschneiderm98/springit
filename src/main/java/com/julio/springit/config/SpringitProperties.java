package com.julio.springit.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("springit")
public class SpringitProperties {

  /**
   * This is our welcome message
   */
  private String welcomeString = "Welcome placeholder";

  public String getWelcomeString() {
    return welcomeString;
  }

  public void setWelcomeString(String welcomeString) {
    this.welcomeString = welcomeString;
  }

}
