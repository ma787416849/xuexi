package com.xdl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xdl.bean.EtHello;
import com.xdl.dao.EtHelloDao;

@Service()
public class EtOccurLogService {
	@Autowired
	private EtHelloDao etHello;
	public List<EtHello> findAllEtOccurLog() {
		return etHello.findAllEtOccurLog();
	}
}
