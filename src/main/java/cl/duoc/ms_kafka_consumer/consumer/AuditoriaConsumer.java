package cl.duoc.ms_kafka_consumer.consumer;

import cl.duoc.ms_kafka_consumer.dto.SolicitudEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuditoriaConsumer {

    @KafkaListener(
            topics = "solicitudes-eventos",
            groupId = "auditoria-processor"
    )
    public void consumir(SolicitudEvent evento) {
        log.info("📋 [Auditoría] Evento recibido: tipo={}, solicitudId={}, comuna={}",
                evento.getTipo(), evento.getId(), evento.getComunaId());

        // TODO: persistir en tabla auditoria_eventos en MySQL
    }
}