package com.artesanoskuad.mvpejemplo;

public class DonationController {
    private DonationModel donationModel;

    public DonationController() {
        this.donationModel = new DonationModel();
    }

    public boolean save(int amount) {
        if (amount <= 0) {
            return false;
        } else {
            this.donationModel.saveDonation(new Donation(amount));
        }
        return true;
    }
    public int getTotalAmount() {
        return this.donationModel.getTotalAmount();
    }
}
