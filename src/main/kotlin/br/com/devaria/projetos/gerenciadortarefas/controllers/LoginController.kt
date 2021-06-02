import br.com.devaria.projetos.gerenciadortarefas.dtos.ErroDTO
import br.com.devaria.projetos.gerenciadortarefas.dtos.LoginDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/login")
class LoginController {

    @GetMapping
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