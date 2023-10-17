-- Switch Stateent like java  use in MySql

select Staff_id , 
case staff_id when 1 then 'nagpur'
				when 2 then 'mumbai'
                else 'invalid' end
                from staff ;