package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.subscription.PlanLimitsResponse;
import com.example.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
