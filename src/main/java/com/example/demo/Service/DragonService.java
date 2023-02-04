package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DragRepo;
import com.example.demo.model.DragonDB;

@Service
@Transactional
public class DragonService {
	
	@Autowired
	private DragRepo repo;
	
	public List<DragonDB> listAll() {
		System.out.println("DragonService.listAll()");
        return repo.findAll();
    }
     
    public void save(DragonDB product) {
    	System.out.println("DragonService.save()");
    	System.out.println(product.getDragonid());
    	System.out.println(product.getDragname());
        repo.save(product);
    }
     
    public DragonDB get(Integer dragonid) {
    	System.out.println("DragonService.get()");
        return repo.findById(dragonid).get();
    }
     
    public void delete(Integer dragonid) {
    	System.out.println("DragonService.delete()");
        repo.deleteById(dragonid);
    }
	
}
