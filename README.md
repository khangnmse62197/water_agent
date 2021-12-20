# Description
[WIKI](https://mahkhang.atlassian.net/l/c/K2Rpges1)

# Structure
**water-agent-service** a spring-boot project with these components allow [DDD](https://medium.com/modern-software-architecture/modern-software-architecture-1-domain-driven-design-f06fad8695f9#:~:text=Domain%2Ddriven%20design%20(DDD),of%20the%20core%20business%20concepts.&text=DDD%20is%20not%20a%20technology,making%20in%20complex%20business%20domains.):

1. **water-agent-application**: core services
2. **water-agent-bootstrap**:  configuration of project such as security, inject configuration, Dockerfile,...
3. **water-agent-common-mapper**: mapstruct, common mapper from dto to vo and the opposite.
4. **water-agent-data-jpa**: entity, repository, specification,...
5. **water-agent-data-rest**: DTO, repository adapter
6. **water-agent-domain**: vo, repository interface, aggregate, command
7. **water-agent-rest**: expose API

In there:
1. Domain layer
- water-agent-domain
- water-agent-common-mapper 
- water-agent-data-rest

2. Application layer
- water-agent-application
- water-agent-rest

3. Infrastructure layer:
- water-agent-bootstrap
- water-agent-data-jpa

|| Application || -> || Domain ||

|| Application || -> || Infrastructure ||

|| Infrastructure || -> || Domain ||

# Start Guideline Window
1. Run run_docker-compose-db.bat to start MySQL Image (Need install Docker Desktop first).
2. Create 1 DB name: water_agent
3. mvn clean compile and start app via IDE(IntelliJ)
TODO: Build project to executable file.