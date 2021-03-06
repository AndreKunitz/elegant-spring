# elegant-spring

Spring project demonstrating elegant ways on how to:
- Disambiguate beans using custom annotations and qualifiers.  
- Inject custom beans in *Spring IoC Container* with custom configuration.
- Configure application using *Spring profiles*
- Increase cohesion using Spring native *Observer Pattern*
- Customize application properties

## How to use:
- Build and start project: `gradle bootRun`
- Access `localhost:8080`
- See application logs

## Important topics covered:
- `@Bean, @Qualifier, @Configuration` Spring annotations;
- Spring profiles;
- Spring beans lifecycle methods;
- Native Spring Observer Pattern implementation;
- Custom property class with `@ConfigurationPropeties` annotation

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
