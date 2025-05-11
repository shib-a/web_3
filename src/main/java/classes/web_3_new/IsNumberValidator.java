package classes.web_3_new;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator("isNumberValidator")
public class IsNumberValidator implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        try {
            Double.parseDouble(value.toString());
        }catch (NumberFormatException e){
            FacesMessage fm = new FacesMessage("Input must only include numbers");
            throw new ValidatorException(fm);

        }
    }
}
