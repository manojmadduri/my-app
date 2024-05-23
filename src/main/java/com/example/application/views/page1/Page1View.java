package com.example.application.views.page1;

import com.example.application.components.phonenumberfield.PhoneNumberField;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.PermitAll;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Page 1")
@Menu(icon = "line-awesome/svg/allergies-solid.svg", order = 1)
@Route(value = "page-1")
@PermitAll
public class Page1View extends Composite<VerticalLayout> {

    public Page1View() {
        MenuBar menuBar = new MenuBar();
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Avatar avatar = new Avatar();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        TextField textField = new TextField();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        EmailField emailField = new EmailField();
        PhoneNumberField phoneNumber = new PhoneNumberField();
        PasswordField passwordField = new PasswordField();
        Hr hr = new Hr();
        RouterLink routerLink = new RouterLink();
        Button buttonPrimary = new Button();
        ComboBox comboBox = new ComboBox();
        Icon icon = new Icon();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        menuBar.setWidth("min-content");
        setMenuBarSampleData(menuBar);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        avatar.setName("Firstname Lastname");
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        textField.setLabel("Text field");
        textField.setWidth("min-content");
        layoutColumn4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.getStyle().set("flex-grow", "1");
        layoutColumn5.setWidthFull();
        layoutColumn4.setFlexGrow(1.0, layoutColumn5);
        layoutColumn5.setWidth("100%");
        layoutColumn5.getStyle().set("flex-grow", "1");
        emailField.setLabel("Email");
        emailField.setWidth("min-content");
        phoneNumber.setLabel("Phone number");
        phoneNumber.setWidth("min-content");
        passwordField.setLabel("Password field");
        passwordField.setWidth("min-content");
        routerLink.setText("Custom View");
        routerLink.setRoute(Page1View.class);
        routerLink.setWidth("min-content");
        buttonPrimary.setText("Button");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        comboBox.setLabel("Combo Box");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        icon.setIcon("lumo:user");
        getContent().add(menuBar);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(avatar);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(textField);
        layoutColumn3.add(layoutColumn4);
        layoutColumn4.add(layoutColumn5);
        layoutColumn5.add(emailField);
        layoutColumn5.add(phoneNumber);
        layoutColumn5.add(passwordField);
        layoutColumn5.add(hr);
        layoutColumn5.add(routerLink);
        layoutColumn5.add(buttonPrimary);
        layoutColumn5.add(comboBox);
        layoutColumn5.add(icon);
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
