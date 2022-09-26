package com.cg.service;

import com.cg.entities.Certificate;

public interface CertificateService 
{
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(int cert_id);
	Certificate deleteCertificate(int cert_id);
	
	

}
