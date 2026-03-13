package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.$;

public class DeliveryPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    public static SelenideElement calendarInput = $("#dateOfDeliveryInput");

    public DeliveryPage setDateOfDelivery(String day, String month, String year){
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

}
