package tf.manager;
import java.math.BigDecimal;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import tf.controller.FormController;
import tf.model.Donator;

@ManagedBean(name="formManager")
@ViewScoped
public class FormManager {
	
	private Donator editDonator = new Donator();
	private ArrayList<Donator> donatorList = new ArrayList<Donator>();
	private FormController formController = new FormController();
	private Donator deletedDonator = new Donator();
	private BigDecimal sum = new BigDecimal("0");
	private int rowCount;
	
	public Donator getEditDonator() {
		return editDonator;
	}

	public void setEditDonator(Donator editDonator) {
		this.editDonator = editDonator;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public Donator getDeletedDonator() {
		return deletedDonator;
	}

	public void setDeletedDonator(Donator deletedDonator) {
		this.deletedDonator = deletedDonator;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public ArrayList<Donator> getDonatorList() {
		return donatorList;
	}

	public void setDonatorList(ArrayList<Donator> donatorList) {
		this.donatorList = donatorList;
	}

	public FormManager(){
		createDonatorList();
	}
	
	private void createDonatorList(){
		if(donatorList != null) donatorList.clear();
		sum = new BigDecimal("0");
		rowCount = 0;
		
		donatorList = formController.getAllDonator();
		rowCount = donatorList.size();
		for(Donator donator : donatorList){
			sum = sum.add(donator.getAmount());
		}
	}
	
	public void saveDonator(){
		System.out.println("ADD : "+editDonator.getName());
		System.out.println("AMOUNT : "+editDonator.getAmount());
		formController.saveDonator(editDonator);
		createDonatorList();
		clearData();
	}
	
	public void clearData(){
		editDonator = new Donator();
	}
	
	public void rowEdit(RowEditEvent event){
		Donator donator = (Donator) event.getObject();
		formController.saveDonator(donator);
		createDonatorList();
	}
	
	public void deleteDonator(){
		System.out.println("delete");
		formController.deleteDonator(deletedDonator);
		createDonatorList();
		deletedDonator = new Donator();
	}
	
	public void print(){
		
	}
	
}
