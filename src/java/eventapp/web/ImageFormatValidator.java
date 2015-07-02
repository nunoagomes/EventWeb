/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.web;

/**
 *
 * @author nunoandrebarbosagomes
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageFormatValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";

    public ImageFormatValidator() {
        pattern = Pattern.compile(IMAGE_PATTERN);
    }

    public boolean validate(final String image) {
        if (image != null) {
            matcher = pattern.matcher(image);
            return matcher.matches();
        }
        return false;
    }
}
