package cl.cyadev.app.DouceAmitie.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pedidos_pasteles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pasteles_Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Pedido_Pastel")
    private int id_Pedido_Pastel;
    @Column(name = "id_Pastel")
    private int id_Pastel;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "valor_Pedido")
    private int valor;
    @Column(name = "Pedido")
    private int Pedido;
}
