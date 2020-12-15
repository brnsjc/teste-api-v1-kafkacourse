package br.com.api.teste.kfka.domain.listener;

import org.springframework.stereotype.Service;

import br.com.api.teste.kfka.domain.User;

@Service
public class KafkaListener {

//	@org.springframework.kafka.annotation.KafkaListener(topics = "novo.topico.msg",
//			groupId = "group_id")
//	public void consumer(String message) {
//		
//		System.out.print("\nConsumer: "+ message);
//		
//	}
	
	@org.springframework.kafka.annotation.KafkaListener(topics = "novo.topico.msg",
			groupId = "group_id",
			containerFactory = "userKafkaListenerContainerFactory")
	public void consumerJson(User user) {
		System.out.print("\nConsumer de JSON: " + user);
	}
}
