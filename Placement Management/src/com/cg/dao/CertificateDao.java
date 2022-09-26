package com.cg.dao;

import com.cg.entities.Certificate;

public interface CertificateDao 
{
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(int cert_id);
	Certificate deleteCertificate(int cert_id);
	
	public abstract void beingTransaction();
	public abstract void commitTransaction();

}