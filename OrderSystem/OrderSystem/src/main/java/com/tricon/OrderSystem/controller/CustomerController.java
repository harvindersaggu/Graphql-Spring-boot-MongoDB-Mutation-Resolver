/*
 * package com.tricon.OrderSystem.controller;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import javax.validation.Valid;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.tricon.OrderSystem.entity.Customer; import
 * com.tricon.OrderSystem.repository.CustomerRepository;
 * 
 * @RestController()
 * 
 * @RequestMapping("/api") public class CustomerController {
 * 
 * @Autowired private CustomerRepository customerRepository;
 * 
 * CustomerController() {
 * System.out.println("Customer Controller object created"); }
 * 
 * @PostMapping public Customer save(@Valid @RequestBody Customer customer) { //
 * customer.set_id(ObjectId.get()); customerRepository.save(customer); return
 * customer; }
 * 
 * @PutMapping("/{id}") public void updateById(@PathVariable("id") String
 * id, @Valid @RequestBody Customer customer) { // customer.set_id(id);
 * customerRepository.save(customer); }
 * 
 * @GetMapping public List<Customer> getAll() { return
 * customerRepository.findAll(); }
 * 
 * @GetMapping("/{id}") public Optional<Customer> get(@PathVariable("id") String
 * id) { // return customerRepository.findBy_id(id); return
 * customerRepository.findById(id); }
 * 
 * @DeleteMapping("/{id}") public void delete(@PathVariable("id") String id) {
 * customerRepository.deleteById(id); } }
 */