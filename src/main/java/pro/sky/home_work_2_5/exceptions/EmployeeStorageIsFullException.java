package pro.sky.home_work_2_5.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR )
public class EmployeeStorageIsFullException extends RuntimeException  {
}
