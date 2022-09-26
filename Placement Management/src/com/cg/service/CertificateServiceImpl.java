package com.cg.service;

import com.cg.dao.CertificateDao;
import com.cg.dao.CertificateDaoImpl;
import com.cg.entities.Certificate;

public class CertificateServiceImpl implements CertificateService
{
private CertificateDao dao;
	
	public CertificateServiceImpl() {
		super();
		dao=new CertificateDaoImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beingTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beingTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int cert_id) {
		Certificate certificate=dao.searchCertificate(cert_id);
		return certificate;
		
	}

	@Override
	public Certificate deleteCertificate(int cert_id) {
		Certificate certificate=dao.deleteCertificate(cert_id);
		return certificate;
		
	}

}
