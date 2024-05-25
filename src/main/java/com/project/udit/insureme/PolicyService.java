package com.insurance.service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public Policy getPolicy(Long id) {
        return policyRepository.findById(id).orElse(null);
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy updatePolicy(Long id, Policy policyDetails) {
        Policy policy = policyRepository.findById(id).orElse(null);
        if (policy != null) {
            policy.setPolicyHolderName(policyDetails.getPolicyHolderName());
            policy.setPolicyId(policyDetails.getPolicyId());
            return policyRepository.save(policy);
        }
        return null;
    }

    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
}
