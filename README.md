# Commands to start Zookeeper and Kafka :
### .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
### .\bin\windows\kafka-server-start.bat .\config\server.properties

## What is Kafka
#### Apache Kafka is a publish-subscribe, fault-tolerant messaging system. It is fast, scalable and distributed by design.

#### It was initially thought of as a message queue and open-sourced by LinkedIn in 2011. Its community evolved Kafka to provide key capabilities:
#### Publish and Subscribe to streams of records, like a message queue.
#### A storage system that allows messages to be consumed asynchronously. Kafka writes data to a scalable disk structure and replicates it for fault-tolerance. Producers can wait for write acknowledgments.
#### Stream processing with Kafka Streams API enables complex aggregations or joins of input streams onto an output stream of processed data.

#### Traditional messaging models are queue and publish-subscribe. In a queue, each record goes to one consumer. In publish-subscribe, the record is received by all consumers.

### Pros of Kafka
##### Loose coupling — Neither service knows about the other regarding data update matters.
##### Durability — Guarantees that the message will be delivered even if the consumer service is down. Whenever the consumer gets up again, all messages will be there.
##### Scalability — Since the messages get stored in a bucket, there is no need to wait for responses. We create asynchronous communication between all services.
##### Flexibility — The sender of a message has no idea who is going to consume it. Meaning you can easily add new consumers (new functionality) with less work.

### Cons of Kafka
##### Semantics — The developer needs to have a deep understanding of the message flow, as it has strict requirements. Complex fallback approaches may take place.
##### Message Visibility — You must track all those messages to allow you to debug whenever a problem occurs. Correlation IDs may be an option.
