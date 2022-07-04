package co.com.bancolombia.api;
import co.com.bancolombia.model.account.Account;
import co.com.bancolombia.usecase.account.AccountUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final AccountUseCase accountUseCase;


    @GetMapping(path = "/path")
    public String commandName() {
//      return useCase.doAction();
        return "Hello World";
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<Account>> ListAccounts() {
        return new ResponseEntity<List<Account>>(accountUseCase.getAccounts(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/account/{id}")
    public ResponseEntity<Account> getAccount(@RequestParam int id) {
        return new ResponseEntity<Account>(accountUseCase.getAccountById(id), new HttpHeaders(), HttpStatus.OK);
    }
}
