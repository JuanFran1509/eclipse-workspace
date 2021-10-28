package es.curso.modelo.persistencia;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Cliente;

@Repository
public class DaoClienteJdbcTemplate implements DaoCliente {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DaoClienteRowMapper clienteRowMapper;


	@Override
	public int insertarCliente(Cliente c) {
		String query = "insert into cliente (NOMBRE, EDAD) values (?, ?)";


		int id = jdbcTemplate.update(query, c.getNombre(), c.getEdad());
		return id;
	}

	@Override
	public int borrar(int id) {
		String query = "delete from cliente where id=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public int modificarCliente(Cliente c, int id) {
		String query = "update cliente SET NOMBRE=?, EDAD=? where id=?";


		int id2 = jdbcTemplate.update(query, c.getNombre(), c.getEdad(), id);

		return id2;
	}

	@Override
	public Cliente buscarID(int id) {
		String query = "select * from cliente where id=?";

		Cliente cliente = null;

		try {
			cliente = jdbcTemplate.queryForObject(query, clienteRowMapper, id);
		} catch (EmptyResultDataAccessException e) {

		}

		return cliente;
	}

	@Override
	public ArrayList<Cliente> buscarNombre(String nombre) {
		String query = "select * from cliente where nombre=?";

		return (ArrayList<Cliente>) jdbcTemplate.query(query, clienteRowMapper, nombre);
	}



	@Override
	public ArrayList<Cliente> listarCliente() {
		String query = "select * from cliente";

		return (ArrayList<Cliente>) jdbcTemplate.query(query, clienteRowMapper);
	}
}
