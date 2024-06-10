package nl.lemkes.demo.java.streams.traffic;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public record Car(
    long id, Color color, UUID kenteken, List<DamageReportRecord> damageReportRecords) {

  public Optional<DamageReportRecord> getLatestDamageReport() {
    return Optional.ofNullable(damageReportRecords).orElse(List.of()).stream()
        .min(Comparator.comparing(DamageReportRecord::date));
  }
}
