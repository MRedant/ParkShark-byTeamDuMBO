package be.dumbo.switchfully.parkshark.api.division;
// copied and adapted code from order solution switchfully

import be.dumbo.switchfully.parkshark.api.member.MemberController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/" + MemberController.RESOURCE_NAME)
public class DivisionController {

    public static final String RESOURCE_NAME = "division";

}
