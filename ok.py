# Drop duplicate store/type combinations
store_types =  sales.drop_duplicates(subset=['store', 'type'])
print(store_types.head())


# Drop duplicate store/department combinations
store_depts = slaes.drop_duplicates(subset=['store', 'department'])
print(store_depts.head())

# Subset the rows where is_holiday is True and drop duplicate dates
holiday_dates = store_types[store_types["is_holiday"]].drop_duplicates('date')

# Print date col of holiday_dates
print(holiday_dates['date'])


#----------------------------------------------  2. Counting categorical variables  ----------------------------------------------

# Count the number of stores of each type
store_counts = store_types.groupby("type")["store"].count()
print(store_counts)

# Get the proportion of stores of each type
store_props = store_types.groupby("type")["store"].count() / store_types["store"].count()
print(store_props)

# Count the number of each department number and sort

dept_counts_sorted = store_depts["department"].value_counts(sort=True, ascending=False)
print(dept_counts_sorted)

# Get the proportion of departments of each number and sort
dept_props_sorted = store_depts["department"].value_counts(sort=True, ascending=False) / store_depts["department"].count()
print(dept_props_sorted)
#----------------------------------------------  3. What percent of sales occurred at each store type?  ----------------------------------------------

# Calc total weekly sales
sales_all = sales["weekly_sales"].sum()

# Group by type; calc total weekly sales
sales_by_type = sales.groupby("type")["weekly_sales"].sum()

