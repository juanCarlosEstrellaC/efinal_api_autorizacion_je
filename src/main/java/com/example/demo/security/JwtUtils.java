package com.example.demo.security;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {

//	@Value("${app.jwtSemilla}")
//	private String jwtSemilla;
//
//	@Value("${app.jwtExpirationMs}")
//	private int jwtExpirationMs;

	private static final Logger LOG = LoggerFactory.getLogger(JwtUtils.class);

	public String buildTokenJwt(String nombre, String semilla, Integer tiempo) {
		LOG.info("Semilla: " + semilla + " Tiempo: " + tiempo);

		return Jwts.builder().setSubject(nombre).setSubject("Hola mundo").setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + tiempo)) // this.jwtExpirationMs
				.signWith(SignatureAlgorithm.HS512, semilla).compact();

	}
}

//semillafckmsdmfmisofsfosofifisdefikiregi9483r84ruff8ufru87rg8ww322rrrrfsemillawdefrfgdtvgbomgobmdrb203290324825835824202405385358035edscfsdfsdfdsuio