import categoriameme.CategoriaMemeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories(basePackageClasses = CategoriaMemeRepository.class)
public class CategoriaMemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CategoriaMemeApplication.class, args);
    }

}
