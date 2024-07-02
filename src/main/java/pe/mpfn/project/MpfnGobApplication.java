package pe.mpfn.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.mpfn.project.persintence.PermisoRepository;
import pe.mpfn.project.persintence.entity.Permiso;

@SpringBootApplication
public class MpfnGobApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpfnGobApplication.class, args);

		PermisoRepository permisoRepository = new PermisoRepository();
		//permisoRepository.getAll();
		System.out.println("YA ESTA");
	}

}
