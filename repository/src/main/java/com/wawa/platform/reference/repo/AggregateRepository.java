
package com.wawa.platform.reference.repo;

        import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wawa.platform.reference.model.Aggregate;
@Repository
public interface AggregateRepository extends JpaRepository<Aggregate, Long> {
}
