package med.voll.api.medico;

import org.springframework.data.jpa.repository.JpaRepository;

//                            <Tipo da entity, tipo atributo PK da entity>

public interface MedicoRepository extends JpaRepository<Medico, Long> {



}
