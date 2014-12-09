package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Sport;
import com.example.jsfdemo.service.AWF;

@SessionScoped
@Named("sportBean")
public class SportBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Sport sport = new Sport();

	private ListDataModel<Sport> sports = new ListDataModel<Sport>();

	@Inject
	private AWF awf;

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public ListDataModel<Sport> getAllSports() {
		sports.setWrappedData(awf.getAllSports());
		return sports;
	}

	// Actions
	public String addSport() {
		awf.addSport(sport);
		return "showSports";
		//return null;
	}

	public String deleteSport() {
		Sport sportToDelete = sports.getRowData();
		awf.deleteSport(sportToDelete);
		return null;
	}

	// Validators

	// Business logic validation
//	public void uniquePin(FacesContext context, UIComponent component,
//			Object value) {
//
//		String nazwa = (String) value;
//
//		for (Sport sport : awf.getAllSports()) {
//			if (sport.getNazwa().equalsIgnoreCase(nazwa)) {
//				FacesMessage message = new FacesMessage(
//						"Sport o tej nazwie juz istnieje w bazie");
//				message.setSeverity(FacesMessage.SEVERITY_ERROR);
//				throw new ValidatorException(message);
//			}
//		}
//	}

	// Multi field validation with <f:event>
	// Rule: first two digits of PIN must match last two digits of the year of
	// birth
//	public void validatePinDob(ComponentSystemEvent event) {
//
//		UIForm form = (UIForm) event.getComponent();
//		UIInput pin = (UIInput) form.findComponent("pin");
//		UIInput dob = (UIInput) form.findComponent("dob");
//
//		if (pin.getValue() != null && dob.getValue() != null
//				&& pin.getValue().toString().length() >= 2) {
//			String twoDigitsOfPin = pin.getValue().toString().substring(0, 2);
//			Calendar cal = Calendar.getInstance();
//			cal.setTime(((Date) dob.getValue()));
//
//			String lastDigitsOfDob = ((Integer) cal.get(Calendar.YEAR))
//					.toString().substring(2);
//
//			if (!twoDigitsOfPin.equals(lastDigitsOfDob)) {
//				FacesContext context = FacesContext.getCurrentInstance();
//				context.addMessage(form.getClientId(), new FacesMessage(
//						"PIN doesn't match date of birth"));
//				context.renderResponse();
//			}
//		}
//	}
}
