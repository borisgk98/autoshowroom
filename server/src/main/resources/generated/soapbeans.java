    @Bean
    public Endpoint autoEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/auto");
        return endpoint;
    }

        @Bean
    public Endpoint autooptionEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoOptionWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/autooption");
        return endpoint;
    }

        @Bean
    public Endpoint customerEndpoint(
            @Autowired SpringBus springBus,
            @Autowired CustomerWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/customer");
        return endpoint;
    }

        @Bean
    public Endpoint automodelEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoModelWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/automodel");
        return endpoint;
    }

        @Bean
    public Endpoint sellerEndpoint(
            @Autowired SpringBus springBus,
            @Autowired SellerWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/seller");
        return endpoint;
    }

        @Bean
    public Endpoint automarkEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoMarkWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/automark");
        return endpoint;
    }

    