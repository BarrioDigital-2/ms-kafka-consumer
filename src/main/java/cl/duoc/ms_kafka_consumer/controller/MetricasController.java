package cl.duoc.ms_kafka_consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/metricas")
public class MetricasController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(Map.of(
                "servicio", "ms-kafka-consumer",
                "estado", "activo"
        ));
    }

    // TODO: endpoint solicitudes-por-comuna con Kafka Streams
}