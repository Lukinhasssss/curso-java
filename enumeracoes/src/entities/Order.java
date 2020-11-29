package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	
	private Integer id; // O id do pedido
	private Date moment; // O instante em que o pedido foi feito
	private OrderStatus status; // O status do meu pedido
	
	// Criando construtor vazio
	public Order() {}
	
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
	
	
}
