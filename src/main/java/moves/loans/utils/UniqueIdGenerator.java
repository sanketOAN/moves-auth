package moves.loans.utils;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public final class UniqueIdGenerator implements IUniqueIdGenerator {

  private final AtomicLong counter = new AtomicLong(0);


  @Override
  public final String generateNextUniqueId() {
    long id = (System.currentTimeMillis() << 10) | (counter.getAndIncrement() & 1023l);
    return Long.toString(id, Character.MAX_RADIX).toUpperCase();
  }

  @Override
  public String generateNextUUID() {
    return String.valueOf(UUID.randomUUID());
  }
}
