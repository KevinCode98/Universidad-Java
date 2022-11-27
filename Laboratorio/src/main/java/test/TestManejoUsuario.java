package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        // Insertar un nuevo objeto de tipo Usuario
//        Usuario usuarioObjeto = new Usuario("SoiledFanatic80", "contra123");
//        usuarioDAO.insertar(usuarioObjeto);

        // Actualizar un objeto de tipo Usuario
//        Usuario usuarioObjeto = new Usuario(    1,"SoiledFanatic80", "Nuevacontra123");
//        usuarioDAO.actualizar(usuarioObjeto);

        // Eliminar un objeto de tipo Usuario
        Usuario usuarioObjeto = new Usuario(1);
        usuarioDAO.eliminar(usuarioObjeto);

        
        // Listar usuarios que se encuentran en la base de datos
        List<Usuario> usuarios = usuarioDAO.seleccionar();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuario);
        });
    }
}
