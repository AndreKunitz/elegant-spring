# spring-bean-custom-qualifier

Spring project demonstrating how to disambiguate beans using custom annotations and qualifiers.  

This project also shows how to inject custom beans in `Spring IoC Container` with custom configuration.

### Important topics:
- `@Qualifier, @Configuration, @Bean` Spring annotations;

### Alternative option for multiple beans:
- An option if having **multiple implementations** of a Bean, is to receive in the injection point a list of Beans, and iterate each bean calling its method.

*Example:*

```java
@Component
public class ActivateCostumerService {

	@Autowired
	private List<Notificator> notifiers;
	
	public void activate(Costumer costumer) {
        costumer.activate();

		for (Notificator notificator : notifiers) {
            notificator.notify(costumer, "Your registration in the system is active!");
		}
	}
}
```
