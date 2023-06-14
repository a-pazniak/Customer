package pl.aleh.customer.controller;

import java.util.Map;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/soc")
public class RegistrationController {

  @GetMapping
  public Map<String, Object> currentUser(OAuth2AuthenticationToken auth2AuthenticationToken) {
    return auth2AuthenticationToken.getPrincipal().getAttributes();
  }

}
