import br.com.devaria.projetos.gerenciadortarefas.dtos.ErroDTO
import br.com.devaria.projetos.gerenciadortarefas.dtos.LoginDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/login")
class LoginController {
    private val LOGIN_TESTE = "admin@admin.com"
    private val SENHA_TESTE = "Admin1234@"

    @GetMapping
    fun efetuarLogin(@RequestBody dto : LoginDTO) : ResponseEntity<Any>{
        try{
            if(dto == null || dto.login.isNullOrBlank() || dto.login.isNullOrEmpty()
                || dto.senha.isNullOrEmpty() || dto.senha.isNullOrBlank())
        }
    }


    fun olaMundo(): String{
        return "Olá mundo!"
    }
    //@PostMapping
    //fun efetuarLogin(@RequestBody dto : LoginDTO) : ResponseEntity<Any> {
      //  try{
        //    throw RuntimeException("Testando uma exceção")

        //}catch (e: Exception){
          //  return ResponseEntity(
            //    ErroDTO(
              //      HttpStatus.INTERNAL_SERVER_ERROR.value(),
                //"Não foi possivel efetuar o login, tente novamente"),
                  //                  HttpStatus.INTERNAL_SERVER_ERROR)
        //}
    //}
}