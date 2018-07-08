package ie.irishlife.empower.poc.service

import org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import org.springframework.http.MediaType.TEXT_EVENT_STREAM
import org.springframework.http.MediaType.TEXT_HTML
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Flux
import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun ServerResponse.BodyBuilder.json() = contentType(APPLICATION_JSON_UTF8)

fun ServerResponse.BodyBuilder.textEventStream() = contentType(TEXT_EVENT_STREAM)

fun ServerResponse.BodyBuilder.html() = contentType(TEXT_HTML)

// Date Extension methods

fun LocalDate.toStr(format:String = "dd/MM/yyyy") = DateTimeFormatter.ofPattern(format).format(this)

fun String.toLocalDate(format:String = "dd/MM/yyyy") = LocalDate.parse(this, DateTimeFormatter.ofPattern(format))