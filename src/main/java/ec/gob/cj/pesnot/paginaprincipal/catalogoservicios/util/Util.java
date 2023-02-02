package ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.util;

import ec.gob.cj.pesnot.paginaprincipal.catalogoservicios.Modelo.Parametro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Util {

  private HttpClient httpClient= HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

  final HttpRequest requestPosts= HttpRequest.newBuilder().
          GET()
          .uri(URI.create("https://pesnot.net/BACK_PARAMETROS-0.0.1-SNAPSHOT/v1/parametros/nombre/SBU"))
          .build();
  //final HttpResponse<Double> response= httpClient.send(requestPosts, HttpResponse.BodyHandler.ofString());

  public static final Locale LOCALE = Locale.forLanguageTag("es-EC");

  private Util() {
  }

  public static String spellNumber(Double number) {
    return "";
  }


}
