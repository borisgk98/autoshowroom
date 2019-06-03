# autoshowroom
MERA intern task


# Download clients

[Download soap client pre-release v.0.1](https://github.com/borisgk98/autoshowroom/releases/download/0.1/soapclient-0.1.jar)

[Download rest client pre-release v.0.1](https://github.com/borisgk98/autoshowroom/releases/download/0.1/restclient-0.1.jar)

# Run client

```bash
java -jar restclient-0.1.jar
```

# How to use clients
## Available entities
* auto
* automark
* automodel
* autooption
* seller
* customer
* order

## Available operations
* read --id <id>
* readll
* readrange --limit <l> --offset <o>
* create <param-1>...<param-n>
* update --id <id> <param-1>...<param-n>
* delete --id <id>

## Get entity
### One entity
```
<entity_name> read <id> 
```
Example:
```
automark read 1
```
Output:
```
name  id 
mark1 1  
```
### All of some entities
```
<entity_name> readall 
```
Example:
```
automark readall
```
Output:
```
name  id 
mark1 1  
```
