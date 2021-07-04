package pjatk.jazs20682nbp.Controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pjatk.jazs20682nbp.Exception.GlobalExceptionHandler;
import pjatk.jazs20682nbp.Model.NBPModel;
import pjatk.jazs20682nbp.Service.NBPService;

import java.util.Date;

@RestController
@RequestMapping("/nbp")
public class NBPController {
    private final NBPService nbpService;

    public NBPController(NBPService nbpService) {
        this.nbpService = nbpService;
    }

    @ApiOperation(value =  "Get average exchange rate",
            response = NBPModel.class,
            notes = "Getting average exchange rate from provided dates")

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fine"),
            @ApiResponse(code = 404, message = "Date not found"),
            @ApiResponse(code = 401, message = "You shouldn't see this"),
            @ApiResponse(code = 403, message = "Nope")
    })

    @GetMapping("/avg/{data_Od}/{data_Do}")
    public ResponseEntity<NBPModel> avgKurs(
            @ApiParam(name = "data_Od",
                    type = "date",
                    value = "2020-01-01",
                    example = "2021-01-01",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date data_Od,
            @ApiParam(name = "data_Do",
                    type = "date",
                    value = "2020-01-02",
                    example = "2021-01-02",
                    required = true,
                    defaultValue = "1")
            @PathVariable Date data_Do
            ) throws GlobalExceptionHandler
            {
        return ResponseEntity.ok(nbpService.avgKurs(data_Od,data_Do));
    }
}
